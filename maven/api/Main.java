public class Main {
    public static void main(String[] args) {
        System.out.println("\tДомашнее задание по теме: \"Сборка проектов. Maven и Grandle.\"");
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}
