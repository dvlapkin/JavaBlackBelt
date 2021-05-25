public class App {

    public static final class City {
        public long countryId;
        public long regionId;

        public City(long countryId, long regionId) {
            this.countryId = countryId;
            this.regionId = regionId;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof City)) {
                return false;
            }
            City that = (City) o;
            return
                    this.countryId == that.countryId &&
                    this.regionId == that.regionId;
        }
    }
    

    public static void main(String[] args) {
        Set s = new LinkedHashSet<City>();
        s.add(new City(1, 1));
        s.add(new City(1, 2));
        s.add(new City(2, 1));
        s.add(new City(1, 1));

        System.out.println(s.size());
    }

}