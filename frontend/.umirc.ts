import {defineConfig} from "umi";

export default defineConfig({
  dva: {},
  routes: [
    {
      path: "/",
      component: "@/layouts/BasicLayout"
    }
  ],
  alias: {
    "@": "./src",
    "air-design": "./node_modules/air-design/aird"
  },
  base: "/",
  outputPath: "../static",
});