public class QuickUnionUF {

    private int id[];
    private int sz[];

    public QuickUnionUF(int N){
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int root(int i){
        while(i != id[i]){
            id[i] = id[id[i]]; // Path compression
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if(i == j){
            return;
        }
        //Weighted quick-union
        if(sz[i] < sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }else{
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public static void main(String[] args) {
        QuickUnionUF test = new QuickUnionUF(10);
        System.out.println("Connected 0 and 9: " + test.connected(0,9));
        test.union(0,9);
        System.out.println("Connected 0 and 9: " + test.connected(0,9));
    }

}
