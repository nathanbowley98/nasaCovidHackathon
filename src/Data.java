public class Data {
    private int FIPS;
    private String Admin2;
    private String Province_State;
    private String Country_Region;
    private String Last_Update;
    private double Lat;
    private double Long_;
    private int Confirmed;
    private int Deaths;
    private int Recovered;
    private int Active;
    private String Combined_Key;
    private double Incidence_Rate;
    private double Case_Fatality_Ratio;

    public Data(int FIPS, String admin2, String province_State, String country_Region, String last_Update, double lat, double long_, int confirmed, int deaths, int recovered, int active, String combined_Key, double incidence_Rate, double case_Fatality_Ratio) {
        this.FIPS = FIPS;
        this.Admin2 = admin2;
        this.Province_State = province_State;
        this.Country_Region = country_Region;
        this.Last_Update = last_Update;
        this.Lat = lat;
        this.Long_ = long_;
        this.Confirmed = confirmed;
        this.Deaths = deaths;
        this.Recovered = recovered;
        this.Active = active;
        this.Combined_Key = combined_Key;
        this.Incidence_Rate = incidence_Rate;
        this.Case_Fatality_Ratio = case_Fatality_Ratio;
    }

    public int getFIPS() {
        return FIPS;
    }

    public void setFIPS(int FIPS) {
        this.FIPS = FIPS;
    }

    public String getAdmin2() {
        return Admin2;
    }

    public void setAdmin2(String admin2) {
        Admin2 = admin2;
    }

    public String getProvince_State() {
        return Province_State;
    }

    public void setProvince_State(String province_State) {
        Province_State = province_State;
    }

    public String getCountry_Region() {
        return Country_Region;
    }

    public void setCountry_Region(String country_Region) {
        Country_Region = country_Region;
    }

    public String getLast_Update() {
        return Last_Update;
    }

    public void setLast_Update(String last_Update) {
        Last_Update = last_Update;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLong_() {
        return Long_;
    }

    public void setLong_(double long_) {
        Long_ = long_;
    }

    public int getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(int confirmed) {
        Confirmed = confirmed;
    }

    public int getDeaths() {
        return Deaths;
    }

    public void setDeaths(int deaths) {
        Deaths = deaths;
    }

    public int getRecovered() {
        return Recovered;
    }

    public void setRecovered(int recovered) {
        Recovered = recovered;
    }

    public int getActive() {
        return Active;
    }

    public void setActive(int active) {
        Active = active;
    }

    public String getCombined_Key() {
        return Combined_Key;
    }

    public void setCombined_Key(String combined_Key) {
        Combined_Key = combined_Key;
    }

    public double getIncidence_Rate() {
        return Incidence_Rate;
    }

    public void setIncidence_Rate(double incidence_Rate) {
        Incidence_Rate = incidence_Rate;
    }

    public double getCase_Fatality_Ratio() {
        return Case_Fatality_Ratio;
    }

    public void setCase_Fatality_Ratio(double case_Fatality_Ratio) {
        Case_Fatality_Ratio = case_Fatality_Ratio;
    }
    @Override
    public String toString() {
        return "Data{" +
                "FIPS=" + FIPS +
                ", Admin2='" + Admin2 + '\'' +
                ", Province_State='" + Province_State + '\'' +
                ", Country_Region='" + Country_Region + '\'' +
                ", Last_Update='" + Last_Update + '\'' +
                ", Lat=" + Lat +
                ", Long_=" + Long_ +
                ", Confirmed=" + Confirmed +
                ", Deaths=" + Deaths +
                ", Recovered=" + Recovered +
                ", Active=" + Active +
                ", Combined_Key='" + Combined_Key + '\'' +
                ", Incidence_Rate=" + Incidence_Rate +
                ", Case_Fatality_Ratio=" + Case_Fatality_Ratio +
                '}';
    }
}
