package guru.springframework.repositories.reactive;

import guru.springframework.domain.UnitOfMeasure;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataMongoTest
public class UnitOfMeasureReactiverRepositoryTest extends TestCase {

    public static final String EACH = "Each";
    @Autowired
    UnitOfMeasureReactiverRepository unitOfMeasureReactiverRepository;

    @Before
    public void setUp() {
       unitOfMeasureReactiverRepository.deleteAll().block();
    }

    @Test
    public void testSaveUom() {
        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setDescription(EACH);

        unitOfMeasureReactiverRepository.save(uom).block();

        long count = unitOfMeasureReactiverRepository.count().block();

        assertEquals(1L, count);

    }

    @Test
    public void  testFindByDescriptionUom() {
        UnitOfMeasure uom = new UnitOfMeasure();
        uom.setDescription(EACH);

        unitOfMeasureReactiverRepository.save(uom).block();

        UnitOfMeasure fetchUOM = unitOfMeasureReactiverRepository.findByDescription(EACH).block();

        assertEquals(EACH, fetchUOM != null ? fetchUOM.getDescription() : null);

    }
}