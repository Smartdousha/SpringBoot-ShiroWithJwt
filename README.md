# 工程简介

SpringBoot整合Shiro+Jwt 方便我直接使用

# 延伸阅读

URL规则<http://shiro.apache.org/web.html

***\*URL结构\****



| URL         | 作用           |

| ------------------- | ----------------------- |

| /login       | 登入           |

| /article      | 所有人都可以访问，但是用户与游客看到的内容不同 |

| /require_auth    | 登入的用户才可以进行访问      |

| /require_role    | admin的角色用户才可以登入     |

| /require_permission | 拥有view和edit权限的用户才可以访问  |

