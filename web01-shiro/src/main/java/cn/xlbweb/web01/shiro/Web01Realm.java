package cn.xlbweb.web01.shiro;

import cn.xlbweb.web01.common.server.Const;
import cn.xlbweb.web01.pojo.SysUser;
import cn.xlbweb.web01.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Mr.X
 * @date: 2018/6/12 下午4:01
 * @description:
 */
@Slf4j
public class Web01Realm extends AuthorizingRealm {

    @Autowired
    private ISysUserService iSysUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        log.info("Shiro授权开始...");
        // 角色
        Set<String> roleNameSet = new HashSet<>();
        // 权限
        Set<String> permissionUrlSet = new HashSet<>();

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(roleNameSet);
        info.setStringPermissions(permissionUrlSet);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        log.info("Shiro认证开始...");
        String username = (String) authenticationToken.getPrincipal();
        SysUser sysUser = iSysUserService.findByUsername(username);
        if (sysUser == null) {
            return null;
        }
        // todo pwd must be set empty
        return new SimpleAuthenticationInfo(sysUser, sysUser.getPassword(), ByteSource.Util.bytes(Const.SALT), getName());
    }
}
