// File: PelangganBuku.java (Main Class)
public class PelangganBuku {
    public static void main(String[] args) {
        Queue antrian = new Queue();

        // Pelanggan 1
        antrian.enqueue("P1Temp"); 
        PelangganNode p1 = antrian.cariPelanggan("P1Temp");
        p1.buku.push("Technical Analysis");
        p1.buku.push("Fundamental Analysis");
        p1.buku.push("Data Analysis");

        // Pelanggan 2
        antrian.enqueue("P2Temp");
        PelangganNode p2 = antrian.cariPelanggan("P2Temp");
        p2.buku.push("Clean Code");
        p2.buku.push("The Pragmatic Programmer");
        p2.buku.push("Design Patterns");

        // Pelanggan 3
        antrian.enqueue("P3Temp");
        PelangganNode p3 = antrian.cariPelanggan("P3Temp");
        p3.buku.push("Dune");
        p3.buku.push("Foundation");
        p3.buku.push("Hyperion");
        p3.buku.push("Neuromancer");

        // Pelanggan 4
        antrian.enqueue("P4Temp");
        PelangganNode p4 = antrian.cariPelanggan("P4Temp");
        p4.buku.push("Sapiens: A Brief History of Humankind");
        p4.buku.push("Guns, Germs, and Steel");
        p4.buku.push("The Silk Roads");

        // Update nama agar sesuai dengan output "Pelanggan ke-1" dst.
        antrian.updateNamaPelanggan(); 
        
        System.out.println("\n=== DATA ANTRIAN AWAL ===");
        antrian.tampilkanSemua();
        System.out.println("----------------------------------\n");
        
        // --- SKENARIO 1: DEQUEUE PELANGGAN KE-1 ---
        System.out.println("=== 2. Setelah pelanggan ke-1 di-dequeue ===");
        antrian.dequeue();
        antrian.updateNamaPelanggan(); // Update nomor pelanggan
        
        antrian.tampilkanSemua();
        System.out.println("----------------------------------\n");

        // 2: POP BUKU PELANGGAN KE-1 (SAAT INI) 2 KALI ---
        System.out.println("=== 3. Buku pelanggan ke-1 di pop 2 kali ===");
        PelangganNode p1SaatIni = antrian.cariPelanggan("Pelanggan ke-1");
        if (p1SaatIni != null) {
            p1SaatIni.buku.pop(); // Pop 1: Clean Code
            p1SaatIni.buku.pop(); // Pop 2: The Pragmatic Programmer
        }
        
        antrian.tampilkanSemua();
        System.out.println("----------------------------------\n");
        
        //ENQUEUE PELANGGAN BARU ---
        System.out.println("=== 4. Enqueue pelanggan baru ===");

        // Pelanggan Baru
        antrian.enqueue("PBaruTemp");
        PelangganNode pBaru = antrian.cariPelanggan("PBaruTemp");
        pBaru.buku.push("Tangkuban Perahu");
        pBaru.buku.push("Timun Mas");
        pBaru.buku.push("Resep Ayam Goyeng Upin Ipin");
        
        antrian.updateNamaPelanggan(); // Update nomor pelanggan (PBaruTemp jadi Pelanggan ke-4)

        antrian.tampilkanSemua();
        System.out.println("----------------------------------\n");
    }
}