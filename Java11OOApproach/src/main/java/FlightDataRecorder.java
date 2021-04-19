import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public final class FlightDataRecorder {

    private static final List<Entry> entries = new ArrayList<>();

    public static void log(String msg){
        entries.add(new Entry(LocalDateTime.now(), msg));
    }

    public static void listLog(){
        for(Entry e : entries)
            System.out.println(e.toString());
    }

    private static class Entry{
        private LocalDateTime dateTime;
        private String log;
        private Entry(LocalDateTime dateTime, String log){
            this.dateTime = dateTime;
            this.log = log;
        }

        @Override
        public String toString(){
            return String.format(" %s - %s, %s",
                    dateTime.toLocalDate().toString(),
                    dateTime.toLocalTime().toString(),
                    log);
        }
    }

}
