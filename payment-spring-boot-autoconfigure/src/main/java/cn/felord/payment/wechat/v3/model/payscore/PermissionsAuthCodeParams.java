/*
 *
 *  Copyright 2019-2020 felord.cn
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *  Website:
 *       https://felord.cn
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package cn.felord.payment.wechat.v3.model.payscore;

import lombok.Data;

/**
 * 适用于以下API:
 * <p>
 * 查询与用户授权记录（授权协议号）API
 * <p>
 * 解除用户授权关系（授权协议号）API
 *
 * @author felord.cn
 * @since 1.0.2.RELEASE
 */
@Data
public class PermissionsAuthCodeParams {
    /**
     * 服务ID，必填
     */
    private String serviceId;
    /**
     * 授权协议号，必填
     */
    private String authorizationCode;
    /**
     * 仅仅适用于解除用户授权关系（授权协议号）API
     */
    private String reason;
}
