package P1396_DesignUndergroundSystem;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: UndergroundSystem2
 * Description:
 * 题解，出站的时候同时统计平均时间，之后调用方法获取平均时间就不必再次计算，省下更多时间。
 *
 * @author Lin Hui
 * Created on 2020/3/29 2:16 下午
 */
class UndergroundSystem2 {
    private final Map<String, Map<String, TimeAndNumber>> stations;
    private final Map<Integer, Customer> customers;

    public UndergroundSystem2() {
        stations = new HashMap<>();
        customers = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Customer c = new Customer(stationName, t);
        customers.put(id, c);
    }

    public void checkOut(int id, String stationName, int t) {
        Customer c = customers.remove(id);
        String beginStation = c.beginStation;
        int time = t - c.beginTime;
        TimeAndNumber tan = stations.computeIfAbsent(c.beginStation, (k) -> new HashMap<>())
                .computeIfAbsent(stationName, (k) -> new TimeAndNumber());
        tan.time += time;
        tan.number++;
    }

    public double getAverageTime(String startStation, String endStation) {
        TimeAndNumber tan = stations.get(startStation).get(endStation);
        return (double) tan.time / tan.number;
    }

    private class Customer {
        private final String beginStation;
        private final int beginTime;

        public Customer(String beginStation, int beginTime) {
            this.beginStation = beginStation;
            this.beginTime = beginTime;
        }
    }

    private class TimeAndNumber {
        public long time;
        public int number;
    }
}
