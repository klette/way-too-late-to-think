package no.iterate.tech.lasttry;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collections;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerData {
    public final String id;
    public final List<String> products;
    public final List<String> offers;

    public CustomerData(String id, List<String> products, List<String> offers) {
        this.id = id;
        this.products = products;
        this.offers = offers;
    }

    protected CustomerData(){ // JAVAAA!!
        id = null;
        products = Collections.EMPTY_LIST;
        offers = Collections.EMPTY_LIST;
    }
}
