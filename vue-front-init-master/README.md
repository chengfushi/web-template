# Vue 3 前端项目模板

一个基于Vue 3、TypeScript和Vite构建的现代化前端项目模板，集成了主流开发工具和最佳实践，可快速搭建企业级应用。

## 特性介绍

### 主流框架与核心特性

- **Vue 3**：采用最新的Vue 3框架，利用Composition API提升代码复用性和可维护性
- **TypeScript**：全面支持类型检查，提供更好的代码提示和错误捕获
- **Vite**：极速的构建工具，提供快速的开发热更新体验
- **Pinia**：Vue官方推荐的状态管理库，替代Vuex，支持TypeScript且API更简洁
- **Vue Router**：实现客户端路由管理，支持嵌套路由和路由守卫

### 开发工具与配置

- **ESLint**：代码质量检查工具，确保代码风格一致
- **Prettier**：代码格式化工具，自动调整代码格式
- **EditorConfig**：统一不同编辑器的编码风格
- **TypeScript配置**：完善的类型检查配置，包括tsconfig.app.json、tsconfig.node.json等
- **Vite配置**：优化的构建配置，支持开发服务器和生产构建

### 业务特性与项目结构

- **布局系统**：提供基础布局组件`<BasicLayout.vue>`，包含全局头部导航
- **页面组织**：基于页面的组件结构，位于`src/pages/`目录
- **组件设计**：通用组件位于`src/components/`目录，如全局头部`<GlobalHeader.vue>`
- **API请求**：封装了请求工具`request.ts`，便于统一处理API调用
- **状态管理**：包含计数器和用户状态管理示例（`stores/counter.ts`和`stores/user.ts`）
- **静态资源**：规范的静态资源管理，位于`src/assets/`目录

## 快速开始

### 环境要求
- Node.js 14.0.0+ 
- npm 6.0.0+ 或 yarn 1.22.0+

### 安装依赖
```bash
npm install
# 或
yarn install
```

### 开发环境
```bash
npm run dev
# 或
yarn dev
```
项目将运行在 http://localhost:3000

### 构建生产版本
```bash
npm run build
# 或
yarn build
```
构建结果将输出到`dist`目录

### 代码检查与格式化
```bash
# 代码检查
npm run lint

# 代码格式化
npm run format
```

## 项目结构

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
