
    /*void main(){
        String name ="cat,dog,fish";
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        System.out.println(name.split(",")[2]);
        System.out.println(name.substring(0,5));
        System.out.println("".isBlank());
        System.out.println(name.compareTo("cat,dog"));

    }
}
*/void main(){
     Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=sc.nextLine();
        System.out.println("enter your department:");
        String department=sc.nextLine();
        System.out.println("enter your age:");
        int age=sc.nextInt();
        System.out.println("details");
        System.out.println("name:"+name);
        System.out.println("department:"+department);
        System.out.println("age:"+age );

    }
