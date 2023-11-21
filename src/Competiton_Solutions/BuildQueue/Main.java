public class Main {
    public static void main(String[] args) {

        Queue q = new Queue(1000);
        FileIO reader = new FileIO();
        String[] input = reader.load("txt");
        for (String s : input) {
            String[] arr = s.split("\t");
            //String[] arr = s.split(" ");
            if (!arr[0].equals("REMOVE")) {
                q.insert(arr[1]);
            } else {
                q.remove();
            }
        }
    }
}