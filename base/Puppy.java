public class Puppy{
    int PupAge;
    public Puppy(String str){
       //这个构造器仅有一个参数：name
       System.out.println("小狗的名字是 : " + str ); 
    }

    public void setAge(int age) {
        PupAge = age;
    }

    public int getAge() {
        return PupAge;
    }
    public static void main(String[] args){
       // 下面的语句将创建一个Puppy对象
       Puppy myPuppy = new Puppy( "tommy" );
       myPuppy.setAge(10);
       System.out.println(myPuppy.getAge());
    }
 }