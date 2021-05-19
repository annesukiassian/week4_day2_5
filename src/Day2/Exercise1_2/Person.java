package Day2.Exercise1_2;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;

    public void setFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 15) {
            return;
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 6 || lastName.length() > 20) {
            return;
        }
        this.lastName = lastName;
    }

    private boolean checkPassportId(String passportId) {
        if (passportId.length() != 8) {
            return false;
        } else if (!(passportId.startsWith("AN"))) {
            return false;
        }
        boolean result = true;
        for (int i = 2; i < passportId.length(); i++) {
            if(passportId.charAt(i) < '0' || passportId.charAt(i) > '9'){
                result = false;
                break;
            }
        }
        return result;
    }

    public void setPassportId(String passportId) {
        if (checkPassportId(passportId))
            this.passportId = passportId;
        else {
            System.out.println("invalid passport id");
        }
    }

    public void setAge(int age) {
        if (age > 99 || age < 18) {
            return;
        }
        this.age = age;
    }

    public void setSex(String sex) {
        if (sex.compareToIgnoreCase("male") == 0 || sex.compareToIgnoreCase("female") == 0) {
            return;
        }
        this.sex = sex;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private String nationality;

    Person() {

    }

    Person(String firstName, String lastName, String passportId, int age, String sex, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }


    public String getPassportId() {
        return passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }


    public void display() {
        System.out.println("Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportId='" + passportId + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nationality='" + nationality + '\'' +
                '}');
    }

}
