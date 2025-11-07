public class Queue {
    PelangganNode front, rear;
    public void enqueue(String nama) {
        PelangganNode baru = new PelangganNode(nama); 
        if (rear == null) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
    }

    public PelangganNode cariPelanggan(String nama) { 
        PelangganNode temp = front;
        while (temp != null) {
            if (temp.nama.equals(nama)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void tampilkanSemua() {
        PelangganNode temp = front; 
        while (temp != null) {
            System.out.println("Pelanggan: " + temp.nama);
            temp.buku.tampilkan();
            temp = temp.next;
        }
    }
    
    // METHOD DEQUEUE
    public String dequeue() {
        if (front == null) return null;
        String nama = front.nama;
        front = front.next;
        if (front == null) rear = null;
        return nama;
    }
    
    // METHOD UNTUK MENGUPDATE NAMA PELANGGAN
    public void updateNamaPelanggan() {
        PelangganNode current = front;
        int num = 1;
        while (current != null) {
            current.nama = "Pelanggan ke-" + num++;
            current = current.next;
        }
    }
}