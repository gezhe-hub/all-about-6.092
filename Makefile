# 1. 定义变量
JAVAC = javac
JAVA = java
SRC_DIR = src
BIN_DIR = bin

# 找出所有的 .java 文件
SOURCES = $(wildcard $(SRC_DIR)/*.java)

# 将 .java 的路径转换为 bin 目录下的 .class 路径
CLASSES = $(SOURCES:$(SRC_DIR)/%.java=$(BIN_DIR)/%.class)

# 2. 默认目标：编译所有文件
all: $(CLASSES)

# 编译规则：如何把 src/*.java 变成 bin/*.class
$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $<

# 3. 运行规则：用法为 make run MAIN=类名
# 比如：make run MAIN=FooCorporation
run: all
	@if [ "$(MAIN)" = "" ]; then \
		echo "错误: 请指定要运行的类名。用法: make run MAIN=ClassName"; \
	else \
		$(JAVA) -cp $(BIN_DIR) $(MAIN); \
	fi

# 4. 清理规则
clean:
	rm -rf $(BIN_DIR)/*

.PHONY: all run clean
