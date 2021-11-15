package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author ：LinRenJie
 * @description：TODO
 * @date ：2021/11/14 21:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("user")
public class User{
  @TableId(value = "id")
  private  Long id;
  private String name;
  private int age;
  private String email;
}
