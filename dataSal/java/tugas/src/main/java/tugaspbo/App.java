package tugaspbo;

import javax.swing.JOptionPane;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // Di dalam main(), dipanggil processArray() di dalam blok try. 
        // Jika processArray() melempar ArrayIndexOutOfBoundsException
        try {
            processArray();
            // catch akan menangkapnya dan mencetak pesan kesalahan. 
            // dan akan menanggapi errornya 
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "error", 0);
        } finally {
            // Blok finally akan selalu dieksekusi, 
            // tidak peduli apakah Exception terjadi atau tidak.
            System.out.println("This is the finally block, it always executes.");
        }
    }
    // dan ini adalah proses arraynya
    public static void processArray() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        
        System.out.println("Processing array.");
        int x = arr[5];
    }
}
