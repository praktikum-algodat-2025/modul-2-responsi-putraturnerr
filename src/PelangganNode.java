public class PelangganNode {
    String nama;
    Stack buku; // Stack buku milik pelanggan ini dal
    PelangganNode next;

    public PelangganNode(String nama) {
        this.nama = nama;
        this.buku = new Stack();
        this.next = null;
    }
}