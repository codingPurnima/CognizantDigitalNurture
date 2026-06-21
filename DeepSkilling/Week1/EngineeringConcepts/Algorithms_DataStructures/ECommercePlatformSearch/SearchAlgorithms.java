public class SearchAlgorithms {

    public static Product linearSearch(Product[] arr, String name) {
        for (Product p : arr) {
            if (p.productName.equals(name)) {
                return p;
            }
        }
        return null;
    }
        public static Product binarySearch(Product[] arr, String name) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cmp = arr[mid].productName.compareTo(name);

            if (cmp == 0) return arr[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}