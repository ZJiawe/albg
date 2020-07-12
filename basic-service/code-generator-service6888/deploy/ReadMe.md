# 代码生成器配置文件

```yaml
server:
  port: 6888

spring:
  application:
    name: code-generator-service
  datasource:
    url: jdbc:mysql://localhost:3306/code-generate?serverTimezone=UTC&characterEncoding=utf-8
    username: root
    password: 123456
    driver-class-name: com.mysql.cj.jdbc.Driver

# Logger Config
logging:
  level:
    com.albg.code: debug

mybatis-plus:
  # xml
  mapper-locations: com.albg.code.domain.mapper/*Mapper.xml
  # 实体扫描，多个package用逗号或者分号分隔
  type-aliases-package: com.albg.code.domain.entitys
  # 扫描枚举类 # 支持统配符 * 或者 ; 分割
  type-enums-package: com.albg.code.infrastructure.enums
  global-config:
    #  关闭打印mybatis Logo
    banner: false
    #刷新mapper 调试神器
    db-config:
      #主键类型  0:"数据库ID自增", 1:"用户输入ID",2:"全局唯一ID (数字类型唯一ID)", 3:"全局唯一ID UUID";
      id-type: ID_WORKER
      #字段策略 0:"忽略判断",1:"非 NULL 判断"),2:"非空判断"
      #      field-strategy: NOT_EMPTY
      #驼峰下划线转换
      column-underline: true
      #数据库大写下划线转换
      capital-mode: true
      #逻辑删除配置
      #      logic-delete-field: active
      logic-delete-value: 0
      logic-not-delete-value: 1
      db-type: mysql
    refresh: true
    #自定义填充策略接口实现
    #meta-object-handler: com.baomidou.springboot.xxx
    #自定义SQL注入器
    #sql-injector: com.baomidou.springboot.xxx
  configuration:
    map-underscore-to-camel-case: true
    cache-enabled: false
    #  日志打印
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
```

# 注意点

### 1. 需要给所有的实体类加上主键标识 @TableId

### 2.对于枚举属性需要额外添加 @EnumValue

### 3.对于枚举类需要继承以及实现 IEnum<T> 接口

### 4.对于版本控制、逻辑删除字段需要设置默认值，如果数据库表中没有设置默认值，则需要在字段上添加@TableField(fill = FieldFill.INSERT)注解，表示在插入这个行为添加默认值。具体的默认值可以在

#### com.albg.code.infrastructure.cfg.MyMetaObjectHandler 中insertFill方法进行添加默认值编写

### 5.如果需要更改包名字请顺便更改

### 	（1）aplication.yaml中mapper-locations、type-aliases-package、type-enums-package相关配置信息

###     （2）启动类App中@MapperScan("com.albg.code.domain.mapper*")配置信息

###     （3）com.albg.code.infrastructure.cfg.MybatisPlusConfig

###  6.对于自动生成控制器部分只是创建类文件，具体需要字间填入内容

