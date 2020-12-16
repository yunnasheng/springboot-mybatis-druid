# 

```
-- 创建表 -- 
CREATE TABLE `lt_dict` (
  `id` varchar(64) NOT NULL,
  `code` varchar(128) NOT NULL,
  `name` varchar(128) NOT NULL,
  `status` varchar(12) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ;
-- 插入数据 --
INSERT INTO lt_dict (id, code, name, status) VALUES ('3c3da1d4b3b94bd9b33fb340dfdb605c', '001', 'cjack-60', '0');
```
