package ma.enset.generics;
import ma.enset.models.Product;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Product> {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void add(Product p) {
        this.productList.add(p);
    }

    @Override
    public List<Product> getAll() {
        return this.productList;
    }

    @Override
    public Product findById(long id) {
        return productList.stream()
            .filter(p -> p.getId() == id)
            .findFirst()
            .orElse(null);
    }

    @Override
    public void delete(long id) {
        productList.removeIf(p -> p.getId() == id);
    }
}