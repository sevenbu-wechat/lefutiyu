package service;

import com.lefutiyu.sevenbu.mp.dao.SignUpUserDAO;
import com.lefutiyu.sevenbu.mp.dto.SignUpUserDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by guoqing on 2019/3/20.
 */
public class LoveSportsServiceTest extends BaseTest {

    private SignUpUserDAO signUpUserDAO;

    @Before
    public void init(){
        signUpUserDAO = Mockito.mock(SignUpUserDAO.class);
    }

    @Test
    public void signUpUserInfoTest(){
        Mockito.when(signUpUserDAO.insert(Mockito.any(SignUpUserDTO.class))).thenReturn(1);
        Assert.assertEquals(1, signUpUserDAO.insert(Mockito.mock(SignUpUserDTO.class)));
    }
}
