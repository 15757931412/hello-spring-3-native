# 运行指南
1. 安装GraalVM：https://www.graalvm.org/downloads/#
2. 安装Visual Studio 2022 Community Version：https://visualstudio.microsoft.com/vs/
3. 生成项目：https://start.spring.io/
4. 编写简单的hello world endpoint代码
5. 运行命令：mvn clean package -Pnative -DskipTests & mvn native:compile-no-fork
> 不要选中文的语言包!!!  
> 还要选择对应的系统sdk
# 资源和效率对比
| 运行时         | 编译时间 (秒) | 启动时间 (秒) | 内存 (MB) |
|-------------|------------------|-------------------|-------------|
| Normal Java | 4.3              | 1.913             | 123.2       |
| Java Native | 382.183          | 0.138             | 24.8        |
