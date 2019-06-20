package datastructures.phonelist;

public class TestMPL {
    public static void main(String[] args) {
        PhoneList aa= new PhoneList();
        PhoneList.PhoneListNode obj = new PhoneList.PhoneListNode("thang", "99898333");
        PhoneList.PhoneListNode obj2 = new PhoneList.PhoneListNode("thang2", "998555598333");
        PhoneList.PhoneListNode obj3 = new PhoneList.PhoneListNode("thang", "22222222222");

        aa.insert(obj);
        aa.insert(obj2);
        aa.insert(obj3);
        aa.remove("thang2");
        aa.print();
        System.out.println("/////");
//        System.out.println(aa.getPhone("thang2"));
    }
}
