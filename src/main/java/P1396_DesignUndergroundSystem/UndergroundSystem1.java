package P1396_DesignUndergroundSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: UndergroundSystem1
 * Description:
 * 设计一个地铁系统，统计进站出站和平均时间
 * 应该来说，这个题目不难，坑的地方在于编写时的逻辑和返回结果的精度，没搞仔细容易搞错。
 *
 * @author Lin Hui
 * Created on 2020/3/29 1:57 下午
 */
public class UndergroundSystem1 {
    List<Record> list;
    Map<Integer, Record> map;
    Map<String, Map<String, Integer>> station = new HashMap<>();

    public UndergroundSystem1() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        map.put(id, new Record(id, stationName, t, true));
    }

    public void checkOut(int id, String stationName, int t) {
        //in
        Record in = map.get(id);
        list.add(in);
        map.remove(id);
        //out
        Record out = new Record(id, stationName, t, false);
        list.add(out);

        int delta = out.t - in.t;

        Map<String, Integer> m = station.get(in.station);
        if (null == m) {
            Map<String, Integer> tmp = new HashMap<>();
            tmp.put(out.station, out.t - in.t);
            station.put(in.station, tmp);
        } else {
            Integer avgTime = m.get(out.station);
            if (null == avgTime) {
                m.put(out.station, out.t - in.t);
            } else {

            }
        }

    }

    public double getAverageTime(String startStation, String endStation) {
        int time = 0;
        int k = 0;
        Map<Integer, Record> tmp = new HashMap<>();
        for (Record record : list) {
            if (record.isIn && startStation.equals(record.station)) {
                tmp.put(record.id, record);
            }
            if (!record.isIn && endStation.equals(record.station)) {
                Record r = tmp.get(record.id);
                if (null != r) {
                    if (startStation.equals(r.station)) {
                        time += (record.t - r.t);
                        k++;
                    } else {
                        tmp.remove(record.id);
                    }
                }
            }
        }
        return k == 0 ? 0 : ((double) time / (double) k);
    }

    class Record {
        int id;
        String station;
        int t;
        Boolean isIn;

        Record(int id, String station, int t, Boolean isIn) {
            this.id = id;
            this.station = station;
            this.t = t;
            this.isIn = isIn;
        }
    }
}
