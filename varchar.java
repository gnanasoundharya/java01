package soundharya;
class keerthi {
    public int small(int... arr) {
        int s = 0;
        {
            for (int i = 0; i < arr.length; i++) {
                s = s + arr[i];

            }
            return s;
        }
    }
}

    public class varchar {
        public static void main (String[] args) {
            keerthi k = new keerthi();
            int sum = k.small(3, 7, 8, 6, 5);
            System.out.println(sum);


        }
    }


