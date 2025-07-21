# SpringBoot + Vue前后端万用模板

**基于 Java SpringBoot 的项目初始模板，整合了常用框架和主流业务的示例代码。**

**只需 1 分钟即可完成内容网站的后端！！！大家还可以在此基础上快速开发自己的项目。**

## 后端模板特点

### 主流框架 & 特性

* **Spring Boot 3.x（贼新）**
* **Spring MVC**
* **MyBatis + MyBatis Plus 数据访问（开启分页）**
* **Spring Boot 调试工具和项目处理器**
* **Spring AOP 切面编程**

### 数据存储

* **MySQL 数据库**
* **Redis 内存数据库**

### 工具类

* **Hutool 工具库**
* **Lombok 注解**

### 业务特性

* **Spring Session Redis 分布式登录**
* **全局异常处理器**
* **自定义错误码**
* **封装通用响应类**
* **Swagger + Knife4j 接口文档**
* **自定义权限注解 + 全局校验**
* **全局跨域处理**
* **长整数丢失精度解决**
* **多环境配置**

### 开始使用

#### 1.依赖加载

下载maven所需的依赖

```yml
mvn install
```



#### 2. 数据库配置

在application.yml文件中输入数据库配置,并运行sql目录下的建表语句

```yml
spring:
  application:
    name: springboot-init
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: 
    username:
    password:
```

#### 3. 打开接口文档

在浏览器中进入http://localhost:8123/api/doc.html

![image-20250721132213554](https://picbed-chengfu-1327906653.cos.ap-guangzhou.myqcloud.com/image/image-20250721132213554.webp)

---

## 前端模板特点

一个基于Vue 3、TypeScript和Vite构建的现代化前端项目模板，集成了主流开发工具和最佳实践，可快速搭建企业级应用。

### 特性介绍

#### 主流框架与核心特性

- **Vue 3**：采用最新的Vue 3框架，利用Composition API提升代码复用性和可维护性
- **TypeScript**：全面支持类型检查，提供更好的代码提示和错误捕获
- **Vite**：极速的构建工具，提供快速的开发热更新体验
- **Pinia**：Vue官方推荐的状态管理库，替代Vuex，支持TypeScript且API更简洁
- **Vue Router**：实现客户端路由管理，支持嵌套路由和路由守卫

#### 开发工具与配置

- **ESLint**：代码质量检查工具，确保代码风格一致
- **Prettier**：代码格式化工具，自动调整代码格式
- **EditorConfig**：统一不同编辑器的编码风格
- **TypeScript配置**：完善的类型检查配置，包括tsconfig.app.json、tsconfig.node.json等
- **Vite配置**：优化的构建配置，支持开发服务器和生产构建

#### 业务特性与项目结构

- **布局系统**：提供基础布局组件`<BasicLayout.vue>`，包含全局头部导航
- **页面组织**：基于页面的组件结构，位于`src/pages/`目录
- **组件设计**：通用组件位于`src/components/`目录，如全局头部`<GlobalHeader.vue>`
- **API请求**：封装了请求工具`request.ts`，便于统一处理API调用
- **状态管理**：包含计数器和用户状态管理示例（`stores/counter.ts`和`stores/user.ts`）
- **静态资源**：规范的静态资源管理，位于`src/assets/`目录

### 快速开始

#### 环境要求
- Node.js 14.0.0+ 
- npm 6.0.0+ 或 yarn 1.22.0+

#### 安装依赖
```bash
npm install
# 或
yarn install
```

#### 开发环境
```bash
npm run dev
# 或
yarn dev
```
项目将运行在 http://localhost:3000

![image-20250721132944884](https://picbed-chengfu-1327906653.cos.ap-guangzhou.myqcloud.com/image/image-20250721132944884.webp)

#### 构建生产版本
```bash
npm run build
# 或
yarn build
```
构建结果将输出到`dist`目录

#### 代码检查与格式化
```bash
# 代码检查
npm run lint

# 代码格式化
npm run format
```

### 项目结构

```
/src
  /api            # API请求相关
  /assets         # 静态资源
  /components     # 通用组件
  /layouts        # 布局组件
  /pages          # 页面组件
  /router         # 路由配置
  /stores         # 状态管理
  App.vue         # 根组件
  main.ts         # 入口文件
  request.ts      # 请求工具
```

## 许可证

[MIT](LICENSE)
