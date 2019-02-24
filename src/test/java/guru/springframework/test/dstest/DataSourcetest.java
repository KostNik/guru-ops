package guru.springframework.test.dstest;


import guru.springframework.test.config.DataSourceConfig;
import guru.springframework.test.ds.FakeDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DataSourceConfig.class)
//if none than "default"
//@ActiveProfiles("qa")
public class DataSourcetest {

    private FakeDataSource fakeDataSource;


    @Autowired
    public void setFakeDataSource(FakeDataSource fakeDataSource) {
        this.fakeDataSource = fakeDataSource;
    }


    @Test
    public void testDatasource() {
        System.out.println(fakeDataSource.getConnectionInfo());
        System.out.println(fakeDataSource.toString());
    }


}
