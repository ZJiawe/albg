import com.albg.code.infrastructure.genertor.config.MyTypeConvert;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;


/**
 * @Auther: MrZheng
 * @Date: 2019/12/14 11:33
 * @Description:
 */
public class CodeGenerateTest {

    /**
     * 生成文件物理位置
     */
    private static final String GENERATE_DIR = "D:\\1.GitFile\\9.albg\\basic-service\\cloud-provider-payment8001\\src\\main\\java";
    /**
     * 作者
     */
    private static final String AUTHOR = "zhengjw";
    /**
     * 数据库连接地址
     */
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/springcloud?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    /**
     * 数据库账号
     */
    private static final String USER_NAME = "root";
    /**
     * 数据库连接密码
     */
    private static final String PASSWORD = "123456";
    /**
     * 父级目录
     */
    private static final String PARENT_URL = "com.albg.provider";

    @Test
    public void generateTest() {
        //1. 全局配置
        GlobalConfig config = new GlobalConfig();
        // 是否支持AR模式
        config.setActiveRecord(false)
                // 作者
                .setAuthor(AUTHOR)
                // 生成路径
                .setOutputDir(GENERATE_DIR)
                // 文件覆盖
                .setFileOverride(false)
                // 设置生成的service接口的名字的首字母是否为I
                .setServiceName("%sService")
                .setBaseResultMap(true)
                .setBaseColumnList(true);

        //2. 数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        // 设置数据库类型
        dsConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
//                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl(DATABASE_URL)
                .setUsername(USER_NAME)
                .setPassword(PASSWORD)
                .setTypeConvert(new MyTypeConvert());

        //3. 策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) // 全局大写命名
                // 数据库表映射到实体的命名策略
                .setNaming(NamingStrategy.underline_to_camel)
                // 字段映射到实体的命名策略
                .setColumnNaming(NamingStrategy.underline_to_camel)
                // 映射表前缀
//                .setTablePrefix("tbl_")
                // 生成的指定的表 注释掉则代表全部表生成
//                .setInclude("table_name)
                // 乐观锁字段
                .setVersionFieldName("version")
                // 逻辑删除字段
                .setLogicDeleteFieldName("active")
                // RestFul风格控制器
                .setRestControllerStyle(true)
                // Boolean类型字段需不需要除去IS前缀
                .setEntityBooleanColumnRemoveIsPrefix(true)
                // 是否为lombok模型
                .setEntityLombokModel(true);

        //4. 包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent(PARENT_URL)
                .setMapper("domain.mapper")
                .setService("domain.service.interfaces")
                .setController("interfaces.controller")
                .setEntity("domain.entitys")
                .setXml("domain.mapper")
                .setServiceImpl("domain.service.impl");

        //5. 整合配置
        AutoGenerator ag = new AutoGenerator();

        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //6. 执行
        ag.execute();
    }
}
