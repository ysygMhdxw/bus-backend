# 🌈 Description



金河市公交线路系统后端部分，使用SpringBoot + Neo4j + MongoDB实现。

# 📖 Finished



✅ 查询线路基本信息（支持模糊与精确搜索）。

✅ 查询站点基本信息（支持模糊与精确搜索，支持使用id搜索）。

✅ 搜索某条公交线路时，返回线路的全部站点（支持模糊与精确搜索）。

✅ 查询某公交站停靠的所有线路（同名站点按照ID分组）（支持模糊与精确搜索）。

# 🤔 Unfinished


🤜🏼查询线路站点信息(方向性、区分上下行、顺序性)

🤜🏼查询某公交站停靠的所有线路(同名站点按照ID分组)

🤜🏼根据起止站点查找沿路站点(运行方向、运行时间)

🤜🏼查询两个站点之间的最短路径(id、name、最少换乘、最短运行时间)

🤜🏼查询两个站点是否存在直达线路(线路方向)

🤜🏼查询线路全部班次信息(环线)

🤜🏼查询具体时间内即将停靠的线路(时间点、id分组)

🤜🏼查询某时间点某公交站指定公交线路的最近3趟班次信息

🤜🏼统计停靠线路最多的站点排序，显示前15个(按照id统计)

🤜🏼统计地铁站数量、起点站数量、终点站数量、单行站数量

🤜🏼分组统计常规公交(干线、支线、城乡线、驳接线、社区线)、快速公交、高峰公交、夜班公交的数量

🤜🏼查询两个公交线路中重复的站点名和站点数量

🤜🏼查询某公交线路上一共有多少条可以换乘的线路，注意去重

🤜🏼查询连接两个公交站之间线路最多的两个站台，降序排列显示前15个

🤜🏼根据公交站数量对线路进行排序，显示前15个

🤜🏼根据运行时间对线路进行排序(运行时间根据班次计算)，显示前15个

🤜🏼计算某条线路之间的重复系数

🤜🏼添加一条站点数不少于10的公交线路

🤜🏼删除某条线路，若沿途站点为该线路独有，也需要删除该站点

🤜🏼将某条线路沿线的一共站点替换为另一个站点，不需要修改班次信息，返回新的沿途站点

# 🆘 Hidden Problems



❎ 所有的输入没有做异常处理。

❎ 一些可能的空指针没有做处理。

