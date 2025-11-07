public class Stack {
    BukuNode top;

    public void push(String judul) {
        BukuNode newNode = new BukuNode(judul);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (top == null) return null;
        String judul = top.judul;
        top = top.next;
        return judul;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void tampilkan() {
        BukuNode current = top;
        while (current != null) {
            System.out.println(" - " + current.judul);
            current = current.next;
        }
    }
}