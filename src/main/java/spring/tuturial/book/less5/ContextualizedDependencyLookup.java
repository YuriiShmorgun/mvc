package spring.tuturial.book.less5;

public class ContextualizedDependencyLookup implements ManagedComponent {

    private Dependency depensecy;

    @Override
    public void performLookup(Container container) {
        this.depensecy = (Dependency) container.getDependency("myDependency");
    }

    @Override
    public String toString() {
        return depensecy.toString();
    }
}
