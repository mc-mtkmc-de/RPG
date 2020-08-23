package de.tempoo50.rpg.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.bukkit.configuration.file.YamlConfiguration;

public class FileWriter {

    private File f;
    private YamlConfiguration c;

    public FileWriter(String FilePath, String FileName) {
        this.f = new File(FilePath, FileName);
        this.c = YamlConfiguration.loadConfiguration(this.f);
    }

    public boolean exist() {
        return f.exists();
    }

    public FileWriter setValue(String ValuePath, Object Value) {
        c.set(ValuePath, Value);
        return this;
    }

    public Object getObject(String ValuePath) {
        return c.get(ValuePath);
    }

    public boolean valueExist(String value){
        return getObject(value) != null;
    }

    public FileWriter save() {
        try {
            this.c.save(this.f);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public boolean getBoolean(String ValuePath) {
        return c.getBoolean(ValuePath);
    }

    public String getString(String ValuePath) {
        return c.getString(ValuePath);
    }

    public Integer getInt(String ValuePath) {
        return c.getInt(ValuePath);
    }

    public List<String> getStringList(String ValuePath) {
        return c.getStringList(ValuePath);
    }

    public List<Integer> getIntList(String ValuePath) {
        return c.getIntegerList(ValuePath);
    }

    public long getLong(String ValuePath) { 
    	return c.getLong(ValuePath); 
    }

    public double getDouble(String ValuePath) {
        return this.c.getDouble(ValuePath);
    }
    
    public Set<String> getKeys(boolean deep) {
    	return c.getKeys(deep);
    }

}
