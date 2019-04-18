package aos.builder;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private String salutation;
    private String suffix;
    private String streetAddress;
    private String cuty;
    private Boolean isFemale;

    private Person(){}

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCuty() {
        return cuty;
    }

    public Boolean getIsFemale() {
        return isFemale;
    }



    public class Builder{
        private Builder(){}

        public Builder setLastName(String lastName){
            Person.this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            Person.this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            Person.this.middleName = middleName;
            return this;
        }

        public Builder setSalutation(String salutation) {
            Person.this.salutation = salutation;
            return this;
        }

        public Builder setSuffix(String suffix) {
            Person.this.suffix = suffix;
            return this;
        }

        public Builder setStreetAddress(String streetAddress) {
            Person.this.streetAddress = streetAddress;
            return this;
        }

        public Builder setCuty(String cuty) {
            Person.this.cuty = cuty;
            return this;
        }

        public Builder setFemale(Boolean female) {
            Person.this.isFemale = female;
            return this;
        }
        public Person build(){
            return Person.this;
        }
    }
}
