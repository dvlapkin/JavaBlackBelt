package com.company;

import java.util.Objects;

public final class City {
        public long countryId;
        public long regionId;

        public City(long countryId, long regionId) {
            this.countryId = countryId;
            this.regionId = regionId;
        }


    @Override
    public int hashCode() {

        return Objects.hash(countryId, regionId);
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

        public String toStr(){
            return new String(countryId+","+regionId);
        }
}
