**结构说明:**

    主要是为了描述与解决在单例实体内部中需要多例组合实体的情况
    
    [参照官方文档](https://docs.spring.io/spring/docs/5.1.7.RELEASE/spring-framework-reference/core.html#beans-factory-lookup-method-injection).

模块主要分为三部分

  1、ioc_question_origin
  
  
      主要用于展示存在的问题
  2、  ioc_ coupling_solution
  
  
      方式一：采用耦合方式解决
      引入 ApplicationContext在每次获取时重新创建一次
      
  3、 ioc_lookup_annotation
     
     方式二：为本节主要推荐方式
     使用方法注入的方注入     
     
****
 
**测试说明：**
主要以打印组合对象的hash值来判断是否为同一个对象的方式
