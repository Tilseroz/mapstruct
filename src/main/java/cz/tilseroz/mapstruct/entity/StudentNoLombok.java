package cz.tilseroz.mapstruct.entity;

import java.util.Objects;

public class StudentNoLombok {

    private Long id;
    private String name;
    private Address address;
    private String email;
    private String password;
    private boolean isActive;
    private Record record;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentNoLombok that = (StudentNoLombok) o;
        return isActive == that.isActive && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(email, that.email) && Objects.equals(password, that.password) && Objects.equals(record, that.record);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, email, password, isActive, record);
    }

    @Override
    public String toString() {
        return "StudentNoLombok{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                ", record=" + record +
                '}';
    }

    public static class Builder {

        private Long id;
        private String name;
        private Address address;
        private String email;
        private String password;
        private boolean isActive;
        private Record record;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

       public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

       public Builder isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder record(Record record) {
            this.record = record;
            return this;
        }

        public StudentNoLombok build() {
            StudentNoLombok studentNoLombok = new StudentNoLombok();
            studentNoLombok.id = this.id;
            studentNoLombok.name =this.name;
            studentNoLombok.address = this.address;
            studentNoLombok.isActive = this.isActive;
            studentNoLombok.record = this.record;
            studentNoLombok.password = this.password;
            studentNoLombok.email = this.email;
            return studentNoLombok;
        }

    }


}
