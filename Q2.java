public class Q2 {
    public static void main(String[] args) {

        ObjectExample ex1 = new ObjectExample("test1",12);
        ObjectExample ex2 = new ObjectExample("test2",13);
        ObjectExample ex3 = new ObjectExample("test3",14);
        ObjectExample[] objArr = {ex1,ex2,ex3};
        ObjectExample[] objArrClone = {null,null,null};
        System.out.println("Object array components:");
        for (int i = 0; i < objArr.length; i++) {
            System.out.println("Name: "+objArr[i].getName()+"\nID: "+objArr[i].getID());
        }

        for (int i = 0; i < objArr.length; i++) {
            objArrClone[i]=objArr[i];
        }
        System.out.println("\n\nCloned object array components:");
        for (int i = 0; i < objArr.length; i++) {
            System.out.println("Name: "+objArrClone[i].getName()+"\nID: "+objArr[i].getID());
        }
    }
}
