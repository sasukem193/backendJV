package datastructures.phonelist;

public class PhoneList {
    private PhoneListNode head;

    public PhoneList() {
        head = null;
    }
//    public PhoneList(String name, String phone) {
//        head = new PhoneListNode(name, phone);
//    }

    public static class PhoneListNode {
        private PhoneListNode next;
        private String name;
        private String phone;

        public PhoneListNode(String name, String phone) {
            this.name = name;
            this.phone = phone;
            next = null;
        }

        public void setData(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getData() {
            return name + " " + phone;
        }

        public String toString() {
            return name + " " + phone;
        }

        public void setNext(PhoneListNode nextPtr) {
            next = nextPtr;
        }

        public PhoneListNode getNext() {
            return next;
        }
    }

//    public class PhoneList {
//        private PhoneListNode head;



        public Boolean isEmpty() {
            return head == null;
        }

        public void insert(PhoneListNode newNode) {
            if (isEmpty()) {
                head = newNode;
            } else {
                PhoneListNode current = head;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(newNode);
            }
        }

        public String getPhone(String name) {
            if (isEmpty()) {
                return "Phone list is empty";
            } else {
                PhoneListNode current = head;
                while ((current.getNext() != null) && (!current.getName().equals(name)))
                    current = current.getNext();
                if (current.getName().equals(name))
                    return current.getData();
                else
                    return ("Sorry. No entry for " + name);

            }
        }

        public String remove(String name) {
            if (isEmpty())
                return "Phone list is empty";
            PhoneListNode current = head;
            PhoneListNode pre = null;
            if (current.getName().equals(name)) {
                head = current.getNext();
                return "Removed" + current.toString();
            }
            while ((current.getNext() != null) &&  (!current.getName().equals(name))){
                pre = current;
                current= current.getNext();
            }
            if (current.getName().equals(name)){
                pre.setNext(current.getNext());
                return "Removed"+ current.toString();
            }
            else
                return ("Sorry. no entry for" + name);
        }

        public void print() {
            if (isEmpty())
                System.out.println("Phone list is empty");
            PhoneListNode current = head;
            while (current != null) {
                System.out.println(current.toString());
                current = current.getNext();
            }
        }
    }

