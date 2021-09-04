public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        try{
            if(age >= 0){
                this.name = name;
                this.age = age;
            }else
                throw new Exception("Invalid Age... Person's data not stored");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try{
            if(age >= 0)
                this.age = age;
            else
                throw new Exception("Invalid Age... Person's age not changed");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
