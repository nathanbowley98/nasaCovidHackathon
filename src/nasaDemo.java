import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class nasaDemo {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("COVID-19-master/COVID-19-master/csse_covid_19_data/csse_covid_19_daily_reports/05-30-2020.csv"));

        int FIPS = 0;
        String Admin2 = null;
        String Province_State = null;
        String Country_Region = null;
        String Last_Update = null;
        double Lat = 0;
        double Long_ = 0;
        int Confirmed = 0;
        int Deaths = 0;
        int Recovered = 0;
        int Active = 0;
        String Combined_Key = null;
        double Incidence_Rate = 0;
        double Case_Fatality_Ratio = 0;

        String [] title = (in.nextLine()).split(",");

        while (in.hasNextLine()) {

            String [] next = (in.nextLine()).split(",");

            boolean condition = true;

            if (next.length == 16) {
                for (int i=0; i<next.length; i++) {
                    if (!next[i].equals("")) {
                        condition = false;
                    }
                    //System.out.println(condition);
                }
            }


            if (!condition) {
                FIPS = Integer.parseInt(next[0]);
                Admin2 = next[1];
                Province_State = next[2];
                Country_Region = next[3];
                Last_Update = next[4];
                Lat = Double.parseDouble(next[5]);
                Long_ = Double.parseDouble(next[6]);
                Confirmed = Integer.parseInt(next[7]);
                Deaths = Integer.parseInt(next[8]);
                Recovered = Integer.parseInt(next[9]);
                Active = Integer.parseInt(next[10]);
                Combined_Key = next[11] + next[12] + next[13];
                Incidence_Rate = Double.parseDouble(next[14]);
                //System.out.println(next[14]);
                Case_Fatality_Ratio = Double.parseDouble(next[15]);

                Data newData = new Data(FIPS, Admin2, Province_State, Country_Region, Last_Update, Lat, Long_, Confirmed, Deaths, Recovered, Active, Combined_Key, Incidence_Rate, Case_Fatality_Ratio);
                System.out.println(newData.toString());
            }
            else {

            }


        }
    }
}
