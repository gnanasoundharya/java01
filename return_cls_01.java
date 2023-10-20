package soundharya;

class raji {
    int num;
    int id;

    public int increment() {

            System.out.println(num + " ");
            return num+1;
        }

    }
    public class return_cls_01 {

        public static void main(String[] args) {
            raji rs = new raji();
            System.out.println(rs.increment());

        }
    }


