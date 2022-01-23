# vueblog-vue

## Install node.js
1. @vue/cli is a Vue tool. Before using npm and @vue/cli, you need to install node.js. Please visit: https://nodejs.org/en/

2. Setup local global module path and cache path:
```
npm config set prefix "~/.node/node_global"
npm config set cache "~/.node/node_cache"
```
3. Setup taobao mirrors
```
npm install -g cnpm --registry=https://registry.npm.taobao.org
npm config set registry http://registry.npm.taobao.org
```
Now, you can use cnpm instead of npm to get faster download speed.

4. Add global module path to your PATH enviroment

## Install @vue/cli
```
cnpm install --global @vue/cli
```

## Project setup
### Change workdir to vueblog-vue
```
cd vueblog-vue
```
### Install dependences
```
cnpm install
```

### Compiles and hot-reloads for development
```
cnpm run serve
```

### Compiles and minifies for production
```
cnpm run build
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).
