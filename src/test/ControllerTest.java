import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:spring-mvc.xml"})
@WebAppConfiguration
@ActiveProfiles("dev")
public class ControllerTest {

    protected MockMvc mockMvc;

    @Autowired
    WebApplicationContext wac;

    // 这个方法在每个方法执行之前都会执行一遍
    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); // 初始化MockMvc对象
    }

    @Test
    public void testString()throws Exception {
        String responseString = mockMvc.perform(
//                    get("/api/user/freeze")
                post("/api/user/freeze") // 请求的url，请求的方法是get
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED) // 数据的格式
                        .param("id","70")
//                    .param("password","123456")
        )
                .andDo(print()) // 打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); // 将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    // moderator add测试
    @Test
    public void testString1()throws Exception {
        String responseString = mockMvc.perform(
                post("/api/moderator/add") // 请求的url，请求的方法是post
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED) // 数据的格式
                        .param("forum_id","5")
                        .param("moderator_level","5")

        )
                .andDo(print()) // 打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); // 将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    // moderator delete测试
    @Test
    public void testString2()throws Exception {
        String responseString = mockMvc.perform(
                post("/api/moderator/delete") // 请求的url，请求的方法是post
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED) // 数据的格式
                        .param("id","5")


        )
                .andDo(print()) // 打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); // 将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    // moderator update测试
    @Test
    public void testString3()throws Exception {
        String responseString = mockMvc.perform(
                post("/api/moderator/update") // 请求的url，请求的方法是post
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED) // 数据的格式
                        .param("id","1")
                        .param("moderator_level","111")

        )
                .andDo(print()) // 打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); // 将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

    // user register测试
    @Test
    public void testString4()throws Exception {
        String responseString = mockMvc.perform(
                post("/api/user/register") // 请求的url，请求的方法是post
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED) // 数据的格式
                        .param("mobile_phone","13025657206")
                        .param("password","123456")
                        .param("email","2422553065@qq.com")

        )
                .andDo(print()) // 打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString(); // 将相应的数据转换为字符串
        System.out.println("-----返回的json = " + responseString);
    }

}
