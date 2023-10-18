package Day16;
import java.util.ArrayList;

public class TransferElement {
    public static void main(String[] args) {
        // Create the source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();
        sourceList.add("Element 1");
        sourceList.add("Element 2");
        sourceList.add("Element 3");

        // Create the destination ArrayList
        ArrayList<String> destinationList = new ArrayList<>();

        // Transfer an element from the source to the destination
        int indexToTransfer = 1; // Index of the element to transfer
        if (indexToTransfer >= 0 && indexToTransfer < sourceList.size()) {
            String elementToTransfer = sourceList.get(indexToTransfer);
            destinationList.add(elementToTransfer);
            sourceList.remove(indexToTransfer);

            System.out.println("Source List: " + sourceList);
            System.out.println("Destination List: " + destinationList);
        } else {
            System.out.println("Invalid index for transfer.");
        }
    }
}
