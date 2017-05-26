package Module_2.Laba_2_13_ENUMS;

/*Create a class TrainSchedule which contains inner class Train.
1) Add to class Train six fields: number (of int type), stationDispatch (of String type),
stationArrival (of String type), timeDispatch (оf String type), timeArrival (of String type)
and days (array of enum type DayOfWeek, containing a list of days of the week),
constructor with one parameter (number train) and getters/setter for each class field.
Override the toString() method in Train to return all information about train.
2) Add to class TrainSchedule private field trains as array of Train and constructor
with one parameter to allocate memory to the schedule.
3) Add to class TrainSchedule public method addTrain() without parameters,
which read from console (using System.in and Scanner) all information on train,
then to create new Train object and pass it to next available array element.
4) Add to class TrainSchedule public method printTrains() which iterates over trains array in loop
and print all information of each train to console.
5) Add to class TrainSchedule public method searchTrain(...) with three parameters,
of String type (stationDispatch, stationArrival ) and of DayOfWeek enum type,
which searches and print all trains that go to the destination after a specified day of the week.*/

import java.time.DayOfWeek;

public class TrainSchedule {
    Train[] trains;

    public TrainSchedule(Train[] trains) {
        this.trains = trains;
    }

    public class Train{
        int number;
        String stationDispatch, stationArrival, timeDispatch, timeArrival;
        DayOfWeek days;

        public Train(int number) {
            this.number = number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public void setDays(DayOfWeek days) {
            this.days = days;
        }

        public int getNumber() {
            return number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public DayOfWeek getDays() {
            return days;
        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + days +
                    '}';
        }
    }

}
