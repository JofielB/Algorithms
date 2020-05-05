public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int idP = id[p];
        int idQ = id[q];
        for (int i = 0; i < id.length ; i++) {
            if(id[i] == idP) id[i] = idQ;
        }
    }

    public static void main(String... args){
        QuickFindUF test = new QuickFindUF(10);
        System.out.println("Connected 0 and 9: " + test.connected(0,9));
        test.union(0,9);
        System.out.println("Connected 0 and 9: " + test.connected(0,9));
    }
}
