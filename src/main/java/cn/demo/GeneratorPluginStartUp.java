package cn.demo;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import cn.demo.confige.GenPlugin;

public class GeneratorPluginStartUp {
	public static void main(String[] args) throws URISyntaxException {
		File configFile = new File(GenPlugin.class.getResource("/generatorConfig.xml").getFile());
		List<String> warnings = new ArrayList<String>();
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		// true:覆盖生成
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = null;
		try {
			config = cp.parseConfiguration(configFile);
			myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
			System.err.println("代码成功生成!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
