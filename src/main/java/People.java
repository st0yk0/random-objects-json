public class People {
    private String firstName;
    private String familyName;
    private byte age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if(age <=0 || age > 75){
             this.age = 45;
        } else {
            this.age = age;
        }
    }

    public People() {
    }

    public People(String firstName, String familyName, byte age) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "People{" +
//                "firstName='" + firstName + '\'' +
//                ", familyName='" + familyName + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
